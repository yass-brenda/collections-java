package arrayList;

import java.util.Arrays;

public class TestArray {

    private int arrayInt[] = {1,2,3,4,5,6};
    private double arrayDouble[] = {8.4,9.3,0.2,7.9,3.4};
    private int arrayIntFill[] ,copyArrayInt[];

    public TestArray(){
        arrayIntFill = new int[10];
        copyArrayInt = new int[arrayInt.length];

        Arrays.fill(arrayIntFill,7);
        Arrays.sort(arrayDouble);

        System.arraycopy( arrayInt, 0, copyArrayInt,
                0, arrayInt.length );
    }


    public void imprimirArreglos()  {
        System.out.print( "arregloDouble: " );
        for ( double valueDouble : arrayDouble )
            System.out.printf( "%.1f ", valueDouble );
        System.out.print( "\narregloInt: " );
        for ( int valueInt : arrayInt )
            System.out.printf( "%d ", valueInt );
        System.out.print( "\narregloIntLleno: " );
        for ( int valueInt : arrayIntFill )
            System.out.printf( "%d ", valueInt );
        System.out.print( "\ncopiaArregloInt: " );
        for ( int valorInt : copyArrayInt )
            System.out.printf( "%d ", valorInt );
        System.out.println( "\n" );
    }

    public int buscarUnInt( int valor ) {
        return Arrays.binarySearch( arrayInt, valor );
    }

    public void imprimirIgualdad() {
        boolean b = Arrays.equals( arrayInt, copyArrayInt );
        System.out.printf( "arregloInt %s copiaArregloInt\n",
                ( b ? "==" : "!=" ) );
        b = Arrays.equals( arrayInt, arrayIntFill );
        System.out.printf( "arregloInt %s arregloIntLleno\n",
                ( b ? "==" : "!=" ) );
    }

    public static void main( String args[] )
    {
        TestArray usoArreglos = new TestArray();
        usoArreglos.imprimirArreglos();
        usoArreglos.imprimirIgualdad();
        int ubicacion = usoArreglos.buscarUnInt( 5 );
        if ( ubicacion >= 0 )
            System.out.printf(
                    "Se encontro el 5 en el elemento %d de arregloInt\n", ubicacion );
        else
            System.out.println( "No se encontro el 5 en arregloInt" );
        ubicacion = usoArreglos.buscarUnInt( 8763 );
        if ( ubicacion >= 0 )
            System.out.printf(
                    "Se encontro el 8763 en el elemento %d en arregloInt\n", ubicacion );
        else
            System.out.println( "No se encontro el 8763 en arregloInt" );
    }
}
