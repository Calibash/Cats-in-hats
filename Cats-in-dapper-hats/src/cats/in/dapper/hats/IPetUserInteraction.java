/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cats.in.dapper.hats;

/**
 *define interaction points allowed to a user with generic pets in a given 
 * system.
 * 
 *other interfaces may be needed to more aptly describe this interaction.
 * possible logical breakpoints are by scene, by pet, by character, by some sort 
 * of affection... 
 * 
 * is it best to define user interaction in such a way? it would be a convenient
 * handle for a GUI, but some of the hypothetical interaction (ie give item) 
 * might do a lot better as say, an abstract. instead of giving the PET the item,
 * could have the user interact ( in that sense) directly with the play area.
 * 
 * the functionality for say, getting the item could then be inverted. instead 
 * of giving the 
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
