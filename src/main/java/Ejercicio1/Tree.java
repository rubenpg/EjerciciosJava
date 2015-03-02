package Ejercicio1;

public class Tree {
	private int altura;
	private String nombre;

	public Tree() {
		this(0, null);
		//System.out.println("Un árbol");
	}

	public Tree(int altura) {
		this(altura, null);
	    //System.out.println("Un árbol de " + altura + " metros");
	}

    public Tree(String nombre) {
        this(0, nombre);
        //System.out.println("Un " + nombre);
    }

    public Tree(int altura, String nombre) {
    	this.altura = altura;
        this.nombre = nombre;
        //System.out.println("Un " + nombre + " de " + altura + " metros");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Un ");
        if (nombre == null)
            sb.append("árbol");
        else
            sb.append(nombre);
        if (altura > 0)
            sb.append(" de ").append(altura).append(" metros");
        return sb.toString();
    }
}
