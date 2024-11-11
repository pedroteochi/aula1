package semana11;

public abstract class Animal02 {
    public abstract void comer();
    public abstract void beber();

    public void comer(){
        System.out.println("Crescendo...");
    }

    public final void registrarLog(){
        System.out.println("Registrando...");
    }
    public void mostrarCampos(Animal02 a){
        Class<?> c = a.getClass();
        for(Field field: c.getDeclaredFields()){
            System.out.println(field.getName());
        }   
    }
