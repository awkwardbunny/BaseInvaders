/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.io.Serializable;

/**
 *
 * @author Aleks
 */
public class Player extends GameObject implements Serializable {

    private final String name;
    private final int id;
    private static int nextId;
    private boolean disabled = false;

    private Point velocity = new Point(0, 0);

    public Player(String name, Point position) {
        super(position);
        this.name = name;
        id = nextId++;
    }

    public Player(Player player) {
        super(new Point(player.getPosition()));
        this.name = player.getName();
        this.velocity = new Point(player.velocity);
        id = player.id;
    }

    public String getName() {
        return name;
    }

    public Point getVelocity() {
        return velocity;
    }

    @Override
    public void nextRound() {
    }

    public int getPlayerId() {
        return id;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }
}
