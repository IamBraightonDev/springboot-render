
package com.eduvoice.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/** @author Paico Uchuya Braighton Maxwell */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "tb_numeros")
public class Numero implements Serializable {
    
    @Id
    @Column(name = "TB_NUM_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "TB_NUM_numero")
    private Integer valor;

    @Column(name = "TB_NUM_texto")
    private String texto;
    
}
