package org.sid;

import java.util.ArrayList;
import java.util.List;

public class GroupeDeFigures extends Figure {
    private List<Figure> figures = new ArrayList<>();

    public void ajouter(Figure fig) {
        figures.add(fig);
    }

    public void supprimer(Figure fig) {
        figures.remove(fig);
    }

    @Override
    public void dessiner() {
        System.out.println("Dessin du groupe de figures:");
        for (Figure fig : figures) {
            fig.dessiner();
        }
    }
}