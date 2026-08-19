package com.sjma.service.impl;

import org.springframework.stereotype.Service;


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
import com.sjma.repository.CandidateProfileEntityRepository;
import com.sjma.repository.CertificationsRepo;
import com.sjma.repository.EducationRepo;
import com.sjma.repository.ExperienceRepo;
import com.sjma.repository.JobpreferenceRepo;
import com.sjma.repository.ProjectRepo;
import com.sjma.repository.ResumeRepo;
import com.sjma.repository.SkillRepo;
import com.sjma.service.CandidateProfileService;
import com.sjma.util.DtoToentiConverterUtil;

@Service
public class CandidateProfileServiceImple implements CandidateProfileService{
	
	private final DtoToentiConverterUtil util;
	
	private final CandidateProfileEntityRepository caProfileEntityRepository;
	private final CertificationsRepo certificationRepo;
	private final EducationRepo educationRepo;
	private final ExperienceRepo experienceRepo;
	private final JobpreferenceRepo jobpreferenceRepo;
	private final ProjectRepo projectRepo;
	private final ResumeRepo resumeRepo;
	private final SkillRepo skillRepo;
	
	public CandidateProfileServiceImple(DtoToentiConverterUtil util,
			CandidateProfileEntityRepository caProfileEntityRepository,
			CertificationsRepo certificationRepo,
			EducationRepo educationRepo,
			ExperienceRepo experienceRepo,
			JobpreferenceRepo jobpreferenceRepo,
			ProjectRepo projectRepo,
			ResumeRepo resumeRepo,
			SkillRepo skillRepo) {
		this.util = util;
		this.caProfileEntityRepository = caProfileEntityRepository;
		this.certificationRepo = certificationRepo;
		this.educationRepo = educationRepo;
		this.experienceRepo = experienceRepo;
		this.jobpreferenceRepo = jobpreferenceRepo;
		this.projectRepo = projectRepo;
		this.resumeRepo = resumeRepo;
		this.skillRepo = skillRepo;
	}

	@Override
	public CandidateProfileEntity save(CandidatesProfileDto profile) {
		
		CandidateProfileEntity candidateProfile =
				util.convertCandidateProfileDtoToEntity(profile);
		
		
		return caProfileEntityRepository.save(candidateProfile);
	}

	@Override
	public Certifications save(certificationsDto certification) {
		Certifications certifications = 
				util.convertCertificationDtoToEntity(certification);
		return certificationRepo.save(certifications);
	}

	@Override
	public Education save(EducationDto education) {
		Education educationEntity =
				util.convertEducationDtoToEntity(education);
		return educationRepo.save(educationEntity);
	}

	@Override
	public Experience save(ExperienceDto experience) {
		Experience experienceEntity = 
				util.convertExperienceDtoToEntity(experience);
		return experienceRepo.save(experienceEntity);
	}

	@Override
	public JobPreference save(JobPreferencesDto jobPreference) {
		JobPreference jobPreferenceEntity = 
				util.convertJobPreferenceDtoToEntity(jobPreference);
		return jobpreferenceRepo.save(jobPreferenceEntity);
	}

	@Override
	public Project save(ProjectsDto projects) {
		Project project = 
				util.convertToEntity(projects);
		return projectRepo.save(project);
	}

	@Override
	public Resume save(ResumeDto resume) {
		Resume resumeEntity = 
				util.convertResumeDtoToEntity(resume);
		return resumeRepo.save(resumeEntity);
	}

	@Override
	public Skill save(skillsDto skill) {
		Skill skills = 
				util.convertSkillsDtoToEntity(skill);
		return skillRepo.save(skills);
	}

}
