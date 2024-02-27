public class HolaMundoColor {
    private String color;
    private String texto;
    private int tamañoLetra;

    public HolaMundoColor(String color, String texto, int size) {
        this.color = color != null ? color : "blanco"; // Si color es nulo, se establece en "blanco"
        this.texto = texto != null ? texto : "¡Hola Mundo!"; // Si texto es nulo, se establece en "¡Hola Mundo!"
        this.tamañoLetra = size > 0 ? size : 14; // Si size es mayor que 0, se establece en size, de lo contrario se establece en 14
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        switch (color.toLowerCase()) {
            case "azul":
                this.color = "\u001B[34m"; // Código ANSI para azul
                break;
            case "amarillo":
                this.color = "\u001B[33m"; // Código ANSI para amarillo
                break;
            case "rojo":
                this.color = "\u001B[31m"; // Código ANSI para rojo
                break;
            default:
                this.color = "\u001B[30m"; // Código ANSI para negro (por defecto)
                break;
        }
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getTamañoLetra() {
        return tamañoLetra;
    }

    public void setTamañoLetra(int tamañoLetra) {
        this.tamañoLetra = tamañoLetra > 0 ? tamañoLetra : 14; // Se asegura de que el tamaño de letra sea mayor que 0
    }

    public void imprimir() {
        System.out.println("\033[38;5;" + color + "m" + texto + "\033[0m" + " con tamaño de letra " + tamañoLetra);
    }
}
