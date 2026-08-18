document.addEventListener("DOMContentLoaded", function () {

    const form = document.getElementById("educationForm");
    const addBtn = document.getElementById("addBtn");
    const clearBtn = document.getElementById("clearBtn");

    const recordsContainer =
        document.getElementById("educationRecords");

    const recordCount =
        document.getElementById("recordCount");

    const emptyState =
        document.getElementById("emptyState");


    // Add Education
    addBtn.addEventListener("click", function () {

        const college =
            document.getElementById("college").value.trim();

        const degree =
            document.getElementById("degree").value;

        const specialization =
            document.getElementById("specialization").value.trim();

        const startYear =
            document.getElementById("startYear").value;

        const graduationYear =
            document.getElementById("graduationYear").value;

        const score =
            document.getElementById("score").value.trim();


        // Check required fields
        if (
            !college ||
            !degree ||
            !specialization ||
            !startYear ||
            !graduationYear ||
            !score
        ) {
            alert("Please fill all required fields.");
            return;
        }


        // Create card
        const card = document.createElement("div");

        card.className =
            "education-card border border-gray-200 " +
            "rounded-lg p-5 bg-white";


        card.innerHTML = `
            <div class="flex justify-between items-start">

                <div>

                    <h3 class="text-lg font-semibold text-gray-900">
                        ${degree}
                    </h3>

                    <p class="text-sm font-medium text-gray-700 mt-1">
                        ${college}
                    </p>

                    <p class="text-sm text-gray-500 mt-1">
                        ${specialization}
                    </p>

                    <p class="text-sm text-gray-500 mt-2">
                        ${startYear} - ${graduationYear}
                    </p>

                    <p class="text-sm text-gray-600 mt-1">
                        Score: ${score}
                    </p>

                </div>

                <button type="button"
                        class="removeBtn text-red-600
                               hover:text-red-800
                               text-sm font-medium">
                    Remove
                </button>

            </div>
        `;


        recordsContainer.appendChild(card);


        // Remove education
        card.querySelector(".removeBtn")
            .addEventListener("click", function () {

                card.remove();

                updateRecordCount();

            });


        updateRecordCount();

        // Clear form after adding
        form.reset();

    });


    // Clear form
    clearBtn.addEventListener("click", function () {

        form.reset();

    });


    // Update record count
    function updateRecordCount() {

        const records =
            recordsContainer.querySelectorAll(".education-card");

        const count = records.length;

        recordCount.textContent =
            count + (count === 1 ? " Record" : " Records");


        if (count === 0) {
            emptyState.classList.remove("hidden");
        } else {
            emptyState.classList.add("hidden");
        }
    }

});