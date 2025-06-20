/*corriger le code*/

public class Polymorph
{
    public static void main(String[] arg)
    {
        Forme[] tabFormes =
                {
                new Cercle2("rouge"),
                new Triangle("Jaune")
                };

        Collect formes = new Collect(10);

        //Une collectioin de formes
        //contenant une copie des objects définis
        //dans le tableau de formes

        for(int i = 0; i < tabFormes.length; i++)
           // formes.add(new Forme(tabFormes[i]));
            formes.add(tabFormes[i].clone());
        formes.dessine();
    }
}

class Forme
{
    private  String couleur;

    public Forme(String uneCouleur)
    {
        couleur = uneCouleur;
    }
    public Forme(Forme other)
    {
        this.couleur = other.couleur;
    }
    public void dessine()
    {
        System.out.println("Une forme " + couleur);
    }
    public Forme clone() {
        return new Forme(this);
    }
}

class Triangle extends Forme
{
    public Triangle(String uneCouleur)
    {
        super(uneCouleur);
    }
    public Triangle(Triangle autreTriangle) {
        super(autreTriangle);
    }
    public void dessine() {
        super.dessine();
        System.out.println("Toute pointue");
    }
    @Override
    public Forme clone() {
        return new Triangle(this);
    }
}

class Cercle2 extends Forme
{
    public Cercle2(String uneCouleur) {
        super(uneCouleur);
    }
    public Cercle2(Cercle2 autreCercle2) {
        super(autreCercle2);
    }
    public void dessine() {
        super.dessine();
        System.out.println("Toute ronde ");
    }
    @Override
    public Forme clone () {
        return new Cercle2(this);
    }

}

class Collect
{
    private Forme[] collect;
    private int index;

    public Collect(int indexMax)
    {
        collect = new Forme[indexMax];
        index = -1;
    }
    public void add(Forme a) {
        if (index < collect.length - 1) {
            ++ index;
            collect[index] = a;
        }
    }
    public void dessine() {
        for( int i = 0; i <= index; ++i) {
            collect[i].dessine();
        }
    }
}