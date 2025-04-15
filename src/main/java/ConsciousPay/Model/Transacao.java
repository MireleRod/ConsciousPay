package ConsciousPay.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.time.LocalDate;


@Entity
@Data
public class Transacao {

    @Id
    @Column (name = "ID")
    @NotNull
    private int id_Transacao;

    @Column (name = "Valor")
    @NotNull
    private double valor;


    @Enumerated(EnumType.STRING)
    @Column (name = "Tipo")
    @NotNull
    private TipoTransacao tipo;


    @Column (name = "Data")
    @NotNull
    private LocalDate data;

    @Column (name = "Descricao")
    @NotNull
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "Id_Usuario", referencedColumnName = "idUsuario")
    private Usuario usuario;


    @ManyToOne
    @JoinColumn(name = "Id_Categoria", referencedColumnName = "id_categoria")
    private Categoria categoria;


    public Transacao(){

    }

    public Transacao(double valor, TipoTransacao tipo, LocalDate data, String descricao){

        this.valor=valor;
        this.tipo=tipo;
        this.data=data;
        this.descricao= descricao;
    }

}