
package com.eduvoice.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/** @author Paico Uchuya Braighton Maxwell */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "tb_palabras")
public class Palabra implements Serializable {
    
    @Id
    @Column(name = "TB_PAL_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "TB_PAL_palabra")
    private String palabra;

    @Column(name = "TB_PAL_categoria")
    private String categoria;
    
}
