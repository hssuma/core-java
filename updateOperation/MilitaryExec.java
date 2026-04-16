class MilitaryExec
{
    public static void main(String[] args)
    {
        Military m = new Military();

        m.addWeapon("Rifle");
        m.addWeapon("Pistol");
        m.addWeapon("Machine Gun");
        m.addWeapon("Sniper");
        m.addWeapon("Tank");
        m.addWeapon("Missile");
        m.addWeapon("Grenade");
        m.addWeapon("Rocket Launcher");
        m.addWeapon("Drone");
        m.addWeapon("Submarine");
        m.addWeapon("Fighter Jet");
        m.addWeapon("Helicopter");
        m.addWeapon("Warship");
        m.addWeapon("Bazooka");
        m.addWeapon("Mortar");
        m.addWeapon("Cannon");
        m.addWeapon("Radar");
        m.addWeapon("Satellite");
        m.addWeapon("Shield");
        m.addWeapon("Knife");
        m.addWeapon("Bomb");
        m.getWeaponNames();
		m.updateWeapon("Rifle", "Cassic Rifle");
		m.getWeaponNames();
    }
}