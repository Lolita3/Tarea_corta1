import com.sun.org.apache.xpath.internal.objects.XString;

public class Lion extends Animal {

     String tipo;


    public Lion(String grupo, String carateristica, String alimentacion, String habitat, String tipo) {
        super(grupo, carateristica, alimentacion, habitat);
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