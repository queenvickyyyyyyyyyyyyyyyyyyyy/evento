import java.util.Objects;

public class Participante{
    private String nome;
    private String email;
    private String telefone;

public Participante (String nome, String email, String telefone){
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
}

public String getNome(){
    return nome;
}

public String getEmail(){
    return email;
}

public String getTelefone(){
    return telefone;
}

public void setNome(String nome){
    this.nome = nome;
}

public void setEmail(String email){
    this.email = email;
}

public void setTelefone(String telefone){
    this.telefone = telefone;
}

public boolean equals(Object o){
    if(this == o) return true;
    if(o == null || getClass() != o.getClass()) return false;
    Participante that = (Participante) o;
    return Objects.equals(email, that.email);
}

public int hashCode(){
    return Objects.hash(email);
}

public String toString(){
    return"Participante: "+
    " nome= "+nome+
    " email= "+email+
    " telefone= "+telefone;
}

}