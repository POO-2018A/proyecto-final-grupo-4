
package juegoproyecto;


public class Personajes {
    
    private String nombre;
    private int vida;
    private int estamina;
    private int ataque;
    private int ataqueFinal;
    private int curacion;
    private int defensa; 

    public Personajes(String nombre, int vida, int estamina, int ataque, int ataqueFinal, int curacion, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.estamina = estamina;
        this.ataque = ataque;
        this.ataqueFinal = ataqueFinal;
        this.curacion = curacion;
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaqueFinal() {
        return ataqueFinal;
    }

    public void setAtaqueFinal(int ataqueFinal) {
        this.ataqueFinal = ataqueFinal;
    }

    public int getCuracion() {
        return curacion;
    }

    public void setCuracion(int curacion) {
        this.curacion = curacion;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    
    
    
}
