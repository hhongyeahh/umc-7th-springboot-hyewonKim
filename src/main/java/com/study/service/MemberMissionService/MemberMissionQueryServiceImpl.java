package com.study.service.MemberMissionService;

import com.study.domain.enums.MissionStatus;
import com.study.domain.mapping.MemberMission;
import com.study.repository.MemberMissionRepository.MemberMissionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;
@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly= true)
public class MemberMissionQueryServiceImpl implements MemberMissionQueryService {
    private final MemberMissionRepository memberMissionRepository;

    @Override
    public Optional<MemberMission> findMemberMissions(Long id) {
        return memberMissionRepository.findById(id);
    }


    @Override
    public List<MemberMission> findMemberMissionsByNameAndMissionStatus(Long memberId, MissionStatus missionStatus) {
        List<MemberMission> filteredMemberMissions =memberMissionRepository.dynamicQueryWithBooleanBuilder(memberId,missionStatus);
        filteredMemberMissions.forEach(memberMission -> System.out.println("MemberMission: "+memberMission));
        return filteredMemberMissions;
    }
}
