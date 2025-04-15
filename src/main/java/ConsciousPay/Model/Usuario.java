package ConsciousPay.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.util.List;

@Data
@Entity
public class Usuario {

    @Id
    @Column(name = "Id_Usuario")
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "Nome")
    @NotNull
    private String nome;

    @Column(name = "Email")
    @NotNull
    private String email;

    @Column(name = "Senha")
    @NotNull
    private String senha;

    @Column(name = "Renda_Mensal")
    @NotNull
    private Double rendaMensal;

    public Usuario() {
    }

    public Usuario(String nome, String email, String senha, Double rendaMensal) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.rendaMensal = rendaMensal;
    }

    @OneToMany(mappedBy = "usuario")
    private List<Transacao> transacoes;


}