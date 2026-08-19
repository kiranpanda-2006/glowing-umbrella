package com.sjma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sjma.dto.candidatesDto.CandidatesProfileDto;
import com.sjma.dto.candidatesDto.EducationDto;
import com.sjma.dto.candidatesDto.ExperienceDto;
import com.sjma.dto.candidatesDto.JobPreferencesDto;
import com.sjma.dto.candidatesDto.ProjectsDto;
import com.sjma.dto.candidatesDto.ResumeDto;
import com.sjma.dto.candidatesDto.certificationsDto;
import com.sjma.dto.candidatesDto.skillsDto;
import com.sjma.service.CandidateProfileService;

@Controller
@RequestMapping("/create")
public class ProfileController {
	
	private final CandidateProfileService service;
	
	public ProfileController(CandidateProfileService service) {
		this.service = service;
	}

    @GetMapping("/profile")
    private String profilePage(Model model){
    	model.addAttribute("profile", new CandidatesProfileDto());
    	return "candidates/profile";
    }
    
    @GetMapping("/education")
    private String educationPage(Model model) {
    	model.addAttribute("education",new EducationDto());
    	return "candidates/education";
    }
    
    @GetMapping("/skills")
    private String skillsPage(Model model) {
    	model.addAttribute("skills",new skillsDto());
    	return "candidates/skills";
    }
    
    @GetMapping("/experience")
    private String experiencePage(Model model) {
    	model.addAttribute("experience",new ExperienceDto());
    	return "candidates/experience";
    }
    
    @GetMapping("/projects")
    private String projectPage(Model model) {
    	model.addAttribute("project",new ProjectsDto());
    	return "candidates/projects";
    }
    
    @GetMapping("/certifications")
    private String certificationPage(Model model) {
    	model.addAttribute("certifications",new certificationsDto());
    	return "candidates/certification";
    }
    
    @GetMapping("/resume")
    private String resumePage(Model model) {
    	model.addAttribute("resume",new ResumeDto());
    	return "candidates/resume";
    }
    
    @GetMapping("/job-preferences")
    private String jobPreferencesPage(Model model) {
    	model.addAttribute("preference",new JobPreferencesDto());
    	return "candidates/job-preferences";
    }
    
    @PostMapping("/profile")
    public String createProfile(
            @ModelAttribute("profile") CandidatesProfileDto profile,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "candidates/profile";
        }

        service.save(profile);

        return "redirect:/create/education";
    }


    @PostMapping("/education")
    public String createEducation(
            @ModelAttribute("education") EducationDto education,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "candidates/education";
        }

        service.save(education);

        return "redirect:/create/skills";
    }


    @PostMapping("/skills")
    public String createSkills(
            @ModelAttribute("skills") skillsDto skills,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "candidates/skills";
        }

        service.save(skills);

        return "redirect:/create/experience";
    }


    @PostMapping("/experience")
    public String createExperience(
            @ModelAttribute("experience") ExperienceDto experience,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "candidates/experience";
        }
        
        service.save(experience);

        return "redirect:/create/projects";
    }


    @PostMapping("/projects")
    public String createProject(
            @ModelAttribute("project") ProjectsDto project,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "candidates/projects";
        }

        service.save(project);

        return "redirect:/create/certifications";
    }


    @PostMapping("/certifications")
    public String createCertification(
            @ModelAttribute("certifications") certificationsDto certifications,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "candidates/certification";
        }

        service.save(certifications);

        return "redirect:/create/resume";
    }


    @PostMapping("/resume")
    public String createResume(
            @ModelAttribute("resume") ResumeDto resume,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "candidates/resume";
        }

        service.save(resume);

        return "redirect:/create/job-preferences";
    }


    @PostMapping("/job-preferences")
    public String createJobPreferences(
            @ModelAttribute("preference") JobPreferencesDto preference,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "candidates/job-preferences";
        }

        service.save(preference);

        return "redirect:/profile";
    }
}
