package com.sjma.service;

import com.sjma.dto.candidatesDto.CandidatesProfileDto;

import com.sjma.dto.candidatesDto.certificationsDto;
import com.sjma.dto.candidatesDto.skillsDto;
import com.sjma.dto.candidatesDto.EducationDto;
import com.sjma.dto.candidatesDto.ExperienceDto;
import com.sjma.dto.candidatesDto.JobPreferencesDto;
import com.sjma.dto.candidatesDto.ProjectsDto;
import com.sjma.dto.candidatesDto.ResumeDto;
import com.sjma.entity.candidateinfoEntity.CandidateProfileEntity;
import com.sjma.entity.candidateinfoEntity.Certifications;
import com.sjma.entity.candidateinfoEntity.Education;
import com.sjma.entity.candidateinfoEntity.Experience;
import com.sjma.entity.candidateinfoEntity.JobPreference;
import com.sjma.entity.candidateinfoEntity.Project;
import com.sjma.entity.candidateinfoEntity.Resume;
import com.sjma.entity.candidateinfoEntity.Skill;

public interface CandidateProfileService {
	
//	candidate CandidateProfileEntity service
	CandidateProfileEntity save(CandidatesProfileDto profile);
	
//	candidate certification service
	Certifications save(certificationsDto certification);
	
//	candidate Education service
	Education save(EducationDto education);
	
//	candidate experience service
	Experience save(ExperienceDto experience);
	
//	candidate jobPreference service
	JobPreference save(JobPreferencesDto jobPreference);
	
//	candidate certification service
	Project save(ProjectsDto projects);
	
	Resume save(ResumeDto resume);
	
	Skill save(skillsDto skill);
	
}
