
public class Woodpecker extends Animal {

     String tipo;

    public Woodpecker(String grupo, String caracteristica, String alimentacion, String  habitat,String tipo) {
        super(grupo, caracteristica, alimentacion, habitat);
        this.tipo = tipo;

    }

    public String getTipo() {
        return tipo;

        }

     public void setTipo(String Tipo) {
        this.tipo = tipo;
     }
    public void main(){
        System.out.println(getGrupo() + "-"+getCaracteristica()+"-"+getAlimentacion()+"-"+getHabitat()+"-"+getTipo());
    }

}
