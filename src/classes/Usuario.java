package classes;

public class Usuario {
    String name;
    String email;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Usuario){
            Usuario outro = (Usuario) obj;
            boolean nomeIgual = outro.name.equals(this.name);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }
}
