/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mezameidiaputri.peminjaman.service.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ASUS
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Anggota {
    private Long anggotaId;
    private String anggotaName;
    private String anggotaAddress;
}