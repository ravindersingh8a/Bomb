package com.example.QuadTree;
import java.util.*;

public class Quad {

        private static final int MAX_POINTS = 3;
        private Region area;
        private List<Camp> camps = new ArrayList<>();
        private List<Quad> quadTrees = new ArrayList<>();

        public Quad(Region area) {
            this.area = area;
        }
    public boolean addPoint(Camp camp) {
        if (this.area.containsPoint(camp)) {
            if (this.camps.size() < MAX_POINTS) {
                this.camps.add(camp);
                return true;
            } else {
                if (this.quadTrees.size() == 0) {
                    createQuadrants();
                }
                return addPointToOneQuadrant(camp);
            }
        }
        return false;
    }


    private boolean addPointToOneQuadrant(Camp camp) {
        boolean isPointAdded;
        for (int i = 0; i < 4; i++) {
            isPointAdded = this.quadTrees.get(i).addPoint(camp);
            if (isPointAdded)
                return true;
        }
        return false;
    }

    private void createQuadrants() {
        Region region;
        for (int i = 0; i < 4; i++) {
            region = this.area.getQuadrant(i);
            quadTrees.add(new Quad(region));
        }
    }

    //specify a searchRegion as the starting point
    public List<Camp> search(Region searchRegion, List<Camp> matches) {
        if (matches == null) {
            matches = new ArrayList<Camp>();
        }
        if (!this.area.doesOverlap(searchRegion)) {
            return matches;
        } else {
            for (Camp point : camps) {
                if (searchRegion.containsPoint(point)) {
                    matches.add(point);
                }
            }
            if (this.quadTrees.size() > 0) {
                for (int i = 0; i < 4; i++) {
                    quadTrees.get(i)
                            .search(searchRegion, matches);
                }
            }
        }
        return matches;
    }

    Array list<Camp> void getDestroyedCamps(int r)
    {
        return null;
    }

    }
