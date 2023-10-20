public class CharlyGarcia {
    private CharlyGarcia INSTANCE = new CharlyGarcia(); //instancia unica de la clase charly garcia.

    private CharlyGarcia(){ //Constructor privado que permite que la instancia sea unica.
    }

    public CharlyGarcia getInstance() {
        return INSTANCE;
    } //Metodo que devuelve la instancia de la clase CharlyGarcia.
}