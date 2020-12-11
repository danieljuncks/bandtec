package br.com.banctec.projetoupload;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Cliente {

    @Id
    private Integer id;

    @Lob
    private byte[] foto;

    // no postgres o tipo seria bytea
    // no mysql o tipo seria blob


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
