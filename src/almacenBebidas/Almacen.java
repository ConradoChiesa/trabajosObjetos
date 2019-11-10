package almacenBebidas;

public class Almacen {

    private Bebida[][] estanteria;
    public Almacen(int filas, int columnas) {
        estanteria=new Bebida[filas][columnas];
    }

    public Almacen() {
        estanteria = new Bebida[5][5];
    }

    public void addBebida(Bebida b) {
        boolean encontrado=false;
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
                if (estanteria[i][j]==null) {
                    estanteria[i][j]=b;
                    encontrado=true;
                }

            }
        }
        if (encontrado) {
            System.out.println("Bebida añadida");
        } else {
            System.out.println("No se ha podido añadir la bebida");
        }
    }

    public void removeBebida(int id) {
        boolean encontrado=false;
        for (int i = 0; i < estanteria.length && !encontrado; i++) {
            for (int j = 0; j < estanteria[0].length && !encontrado; j++) {
                if (estanteria[i][j]!=null) {
                    if (estanteria[i][j].getId()==id) {
                        estanteria[i][j]=null;
                        encontrado=true;
                    }
                }

            }
        }
        if (encontrado) {
            System.out.println("Bebida eliminada");
        } else {
            System.out.println("No existe la bebida");
        }
    }

    public void mostrarBebida() {
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j]!=null) {
                    System.out.println("FIla "+i+", columna: "+j+" Bebida: "+estanteria[i][j].toString());

                }

            }
        }
    }

    public double calcularPrecioBebidas() {
        double precioTotal=0;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j]!=null) {
                    precioTotal+=estanteria[i][j].getPrecio();
                }

            }
        }
        return precioTotal;
    }

    public double calcularPrecioBebidas(String marca) {
        double precioTotal=0;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if (estanteria[i][j]!=null) {
                    if (estanteria[i][j].getMarca().equalsIgnoreCase(marca)) {
                        precioTotal+=estanteria[i][j].getPrecio();
                    }
                }

            }
        }
        return precioTotal;
    }

    public double calcularPrecioBebidas(int col) {
        double precioTotal=0;
        if (col>=0 && col<estanteria[0].length) {
            for (int i = 0; i < estanteria.length; i++) {
                if (estanteria[i][col]!=null) {
                    precioTotal+=estanteria[i][col].getPrecio();
                }
            }
        } else {
            System.out.println("La columna debe estar entre o y "+estanteria[0].length);
        }
        return precioTotal;
    }
}
