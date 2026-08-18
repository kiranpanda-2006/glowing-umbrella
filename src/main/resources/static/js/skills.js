document.addEventListener("DOMContentLoaded", function () {

    const form = document.getElementById("skillsForm");

    const saveBtn =
        document.getElementById("saveSkillsBtn");

    const clearBtn =
        document.getElementById("clearSkillsBtn");

    const skillsContainer =
        document.getElementById("skillsContainer");

    const skillCount =
        document.getElementById("skillCount");

    const emptySkills =
        document.getElementById("emptySkills");


    // Save Skills
    saveBtn.addEventListener("click", function () {

        const technicalSkill =
            document.getElementById("technicalSkill")
                .value.trim();

        const programmingLanguage =
            document.getElementById("programmingLanguage")
                .value.trim();

        const framework =
            document.getElementById("framework")
                .value.trim();

        const database =
            document.getElementById("database")
                .value.trim();

        const tools =
            document.getElementById("tools")
                .value.trim();

        const otherSkills =
            document.getElementById("otherSkills")
                .value.trim();


        // Combine all skills
        const skills = [
            ...technicalSkill.split(","),
            ...programmingLanguage.split(","),
            ...framework.split(","),
            ...database.split(","),
            ...tools.split(","),
            ...otherSkills.split(",")
        ]
        .map(skill => skill.trim())
        .filter(skill => skill !== "");


        // No skills entered
        if (skills.length === 0) {

            alert("Please add at least one skill.");

            return;
        }


        // Add each skill
        skills.forEach(function (skill) {

            addSkill(skill);

        });


        updateSkillCount();

        // Clear form
        form.reset();

    });


    // Clear button
    clearBtn.addEventListener("click", function () {

        form.reset();

    });


    // Add skill badge
    function addSkill(skill) {

        const badge =
            document.createElement("span");

        badge.className =
            "skill-badge inline-flex items-center gap-2 " +
            "px-3 py-1 text-sm font-medium " +
            "text-blue-800 bg-blue-100 rounded-full";


        badge.innerHTML = `
            <span>${skill}</span>

            <button type="button"
                    class="removeSkill text-blue-600
                           hover:text-red-600 font-bold">
                ×
            </button>
        `;


        skillsContainer.appendChild(badge);


        // Remove skill
        badge.querySelector(".removeSkill")
            .addEventListener("click", function () {

                badge.remove();

                updateSkillCount();

            });


        emptySkills.classList.add("hidden");

    }


    // Update count
    function updateSkillCount() {

        const skills =
            skillsContainer.querySelectorAll(".skill-badge");

        const count = skills.length;


        skillCount.textContent =
            count + (count === 1 ? " Skill" : " Skills");


        if (count === 0) {

            emptySkills.classList.remove("hidden");

        } else {

            emptySkills.classList.add("hidden");

        }

    }

});