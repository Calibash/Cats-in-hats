/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cats.in.dapper.hats;

/**
 *define interaction points allowed to a user with generic pets in a given system
 * @author Calibash
 */
public interface IPetUserInteraction {
    //feed the pet
    public void feedPet();//TODO -CLS - possible food item requirement
    //pat the pet
    public void giveAffection();//TODO -CLS - determine whether affection type needs specify
    //give a pet an item to use as it will
    public void giveItem();//TODO -CLS - determine method call type
}
