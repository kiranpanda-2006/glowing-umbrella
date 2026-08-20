package com.sjma.util;


import org.springframework.stereotype.Component;


import com.sjma.dto.candidatesDto.CandidatesProfileDto;
import com.sjma.dto.candidatesDto.EducationDto;
import com.sjma.dto.candidatesDto.ExperienceDto;
import com.sjma.dto.candidatesDto.JobPreferencesDto;
import com.sjma.dto.candidatesDto.ProjectsDto;
import com.sjma.dto.candidatesDto.ResumeDto;
import com.sjma.dto.candidatesDto.certificationsDto;
import com.sjma.dto.candidatesDto.skillsDto;
import com.sjma.entity.candidateinfoEntity.CandidateProfileEntity;
import com.sjma.entity.candidateinfoEntity.Certifications;
import com.sjma.entity.candidateinfoEntity.Education;
import com.sjma.entity.candidateinfoEntity.Experience;
import com.sjma.entity.candidateinfoEntity.JobPreference;
import com.sjma.entity.candidateinfoEntity.Project;
import com.sjma.entity.candidateinfoEntity.Resume;
import com.sjma.entity.candidateinfoEntity.Skill;

@Component
public class DtoToentiConverterUtil {
	
	
	public CandidateProfileEntity convertCandidateProfileDtoToEntity(CandidatesProfileDto profile) {
		
		CandidateProfileEntity profileEntity = new CandidateProfileEntity();
		
		profileEntity.setFullName(profile.getFullName());
		profileEntity.setAddress(profile.getAddress());
		profileEntity.setGender(profile.getGender());
		profileEntity.setLocation(profile.getLocation());
		profileEntity.setDateOfBirth(profile.getDateOfBirth());
		profileEntity.setMobileNumber( profile.getMobileNumber());
		
		return profileEntity;
	}
	
    public  Certifications convertCertificationDtoToEntity(certificationsDto dto) {

        Certifications certification = new Certifications();

        certification.setCertificationName(dto.getCertificationName());
        certification.setIssueingOrganization(dto.getIssueingOrganization());
        certification.setIssuedAt(dto.getIssuedAt());
        certification.setCresentialId(dto.getCresentialId());
        certification.setCredentialUrl(dto.getCredentialUrl());

        return certification;
    }
    
    public Education convertEducationDtoToEntity(EducationDto dto) {

        Education education = new Education();

        education.setCollege(dto.getCollege());
        education.setSpecialization(dto.getSpecialization());
        education.setDegree(dto.getDegree());
        education.setStartYear(dto.getStartYear());
        education.setGraduationYear(dto.getGraduationYear());
        education.setCgpa(dto.getCgpa());

        return education;
    }
    
    public Experience convertExperienceDtoToEntity(ExperienceDto dto) {

        Experience experience = new Experience();

        experience.setCompanyName(dto.getCompanyName());
        experience.setJobTitle(dto.getJobTitle());
        experience.setEmploymentType(dto.getEmploymentType());
        experience.setLocation(dto.getLocation());
        experience.setStartDate(dto.getStartDate());
        experience.setEndDate(dto.getEndDate());
        experience.setCurrentelyWorking(dto.getCurrentelyWorking());
        experience.setDescription(dto.getDescription());

        return experience;
    }
    
    public JobPreference convertJobPreferenceDtoToEntity(JobPreferencesDto dto) {

        JobPreference jobPreferences = new JobPreference();

        jobPreferences.setRole(dto.getRole());
        jobPreferences.setPreferedLocation(dto.getPreferredLocation());
        jobPreferences.setEmployeeType(dto.getEmploymentType());
        jobPreferences.setExperienceLevel(dto.getExperienceLevel());
        jobPreferences.setExpectedSalary(dto.getExpectedSalary());
        jobPreferences.setWorkMode(dto.getWorkMode());

        return jobPreferences;
    }
    
    public Project convertToEntity(ProjectsDto dto) {

        Project projects = new Project();

        projects.setProjectName(dto.getProjectName());
        projects.setProjectDescription(dto.getProjectDescription());
        projects.setTechnologyUsed(dto.getTechnologyUsed());
        projects.setGithubUrl(dto.getGithubUrl());
        projects.setLiveUrl(dto.getLiveUrl());

        return projects;
    }
    
    public Resume convertResumeDtoToEntity(ResumeDto dto) {

        Resume resume = new Resume();

        resume.setResume(dto.getResume());

        return resume;
    }
    
    public Skill convertSkillsDtoToEntity(skillsDto dto) {

        Skill skills = new Skill();

        skills.setTechnicalSkill(dto.getTechnicalSkill());
        skills.setProgramingLanguage(dto.getProgramingLanguage());
        skills.setFrameworks(dto.getFrameworks());
        skills.setDbKnowledge(dto.getDatabase());
        skills.setTools(dto.getTools());

        return skills;
    }

}
