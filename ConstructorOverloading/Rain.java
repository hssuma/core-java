class Rain {
    int id;
	String type;
	double intensity;
	String season;
	boolean heavy;

    Rain() {}
    Rain(int id) { this.id = id; }
    Rain(int id, String type) { this.id = id; this.type = type; }
    Rain(int id, String type, double intensity) { this.id = id; this.type = type; this.intensity = intensity; }
    Rain(int id, String type, double intensity, String season) { this.id = id; this.type = type; this.intensity = intensity; this.season = season; }
    Rain(int id, String type, double intensity, String season, boolean heavy) {
        this.id = id;
		this.type = type;
		this.intensity = intensity;
		this.season = season;
		this.heavy = heavy;
    }

    void display() { 
 System.out.println("id is"+ id);
		System.out.println("Type is " + type);
		System.out.println("Intensity is " + intensity);
		System.out.println(" Season is " + season );
		System.out.println("Is it is Heavy " + heavy);	}
}