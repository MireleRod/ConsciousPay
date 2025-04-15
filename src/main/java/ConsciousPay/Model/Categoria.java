package ConsciousPay.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Data
public class Categoria {

    @Id
    @Column (name = "ID")
    @NotNull
    private int id_categoria;


    @Column (name = "Nome")
    @NotNull
    private String nome;


    public Categoria(){

    }

    public Categoria(String nome){
        this.nome = nome;

    }

    @OneToMany(mappedBy = "categoria")
    private List<Transacao> transacoes;

}