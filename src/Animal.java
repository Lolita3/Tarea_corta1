
public  abstract class Animal {
    private String grupo;
    private String caracteristica;
    private String alimentacion;
    private String habitat;

    public Animal( String grupo, String caracteristica, String alimentacion, String habitat ) {
        this.grupo = grupo;
        this.caracteristica = caracteristica;
        this.alimentacion = alimentacion;
        this.habitat = habitat;

    }
     public String getGrupo() {
        return grupo;
     }
     public void setGrupo(String grupo) {
        this.grupo = grupo;

     }
     public String getCaracteristica(){
        return caracteristica;
     }
     public void setCaracteristica() {
        this.caracteristica = caracteristica;
     }

     public String getAlimentacion() {
        return alimentacion;
     }
     public void setAlimentacion(){
        this.alimentacion = alimentacion;

     }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat( String habitat) {
        this.habitat = habitat;
    }
}
