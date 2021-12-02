package com.hospital.hispitalapp.controller;

import com.hospital.hispitalapp.entity.Hospital;
import com.hospital.hispitalapp.service.HospitalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospitals")
@RequiredArgsConstructor
public class HospitalController {
    private final HospitalService hospitalService;

    @GetMapping
    public ResponseEntity<List<Hospital>> findAll(){
        return ResponseEntity.ok(hospitalService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hospital> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok(hospitalService.findById(id));
    }

    @PostMapping
    public Hospital save(@RequestBody Hospital hospital){
        return hospitalService.save(hospital);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        hospitalService.delete(id);
    }

    @PutMapping
    public ResponseEntity<Hospital> update(@RequestBody Hospital hospital){
        return ResponseEntity.ok(hospitalService.update(hospital));
    }
}
