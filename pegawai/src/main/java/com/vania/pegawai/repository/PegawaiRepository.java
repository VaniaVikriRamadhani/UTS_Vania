/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vania.pegawai.repository;

import com.vania.pegawai.entity.Pegawai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public interface PegawaiRepository extends JpaRepository<Pegawai, Long> {
    
    public Pegawai findByPegawaiId(Long pegawaiId);

    public Pegawai save(Pegawai pegawai);
    
}
