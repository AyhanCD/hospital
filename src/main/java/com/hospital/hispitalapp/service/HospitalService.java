package com.hospital.hispitalapp.service;

import com.hospital.hispitalapp.entity.Hospital;
import com.hospital.hispitalapp.repository.HospitalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HospitalService {
    private final HospitalRepository hospitalRepository;

    public List<Hospital> findAll(){
        return hospitalRepository.findAll();
    }

    public Hospital findById(Long id){
        return hospitalRepository.findById(id).get();
    }

    public Hospital save(Hospital hospital){

        Hospital hospitalForSave = new Hospital(
                hospital.getId(),
                hospital.getName(),
                hospital.getEmail(),
                hospital.getAddress(),
                hospital.getPhone(),
                hospital.getCommentList());

        return hospitalRepository.save(hospitalForSave);
    }

    public void delete(Long id){
        Hospital hospitalForDelete = hospitalRepository.findById(id).get();
        hospitalRepository.delete(hospitalForDelete);
    }

    public Hospital update(Hospital hospital){
        Hospital hospitalForUpdate = hospitalRepository.findById(hospital.getId()).get();

        hospitalForUpdate.setName(hospital.getName());
        hospitalForUpdate.setAddress(hospital.getAddress());
        hospitalForUpdate.setEmail(hospital.getEmail());
        hospitalForUpdate.setPhone(hospital.getPhone());

        return hospitalRepository.save(hospitalForUpdate);
    }

}
