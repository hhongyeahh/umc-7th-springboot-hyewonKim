package com.study.service.MemberMissionService;

import com.study.domain.mapping.MemberMission;
import com.study.dto.request.MemberMissionRequestDTO;

public interface MemberMissionCommandService {
    MemberMission updateMemberMissionStatus(MemberMissionRequestDTO.updateMemberMissionStatusDto request, Long memberId, Long missionId);
}