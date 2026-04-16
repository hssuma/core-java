class StateElectionExec
{
    public static void main(String[] args)
    {
        StateElection s = new StateElection();

        s.addParty("BJP");
        s.addParty("Congress");
        s.addParty("AAP");
        s.addParty("JDS");
        s.addParty("DMK");
        s.addParty("TMC");
        s.addParty("Shiv Sena");
        s.getNames();
		s.updatePartyName("Shiv Sena", "SS");
		s.getNames();
    }
}