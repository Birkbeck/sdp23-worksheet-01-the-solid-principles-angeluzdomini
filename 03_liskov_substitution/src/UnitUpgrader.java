public class UnitUpgrader {

    public void upgrade(PenthouseSuite penthouseSuite) {
        upgradeSquareFootage(penthouseSuite);
        penthouseSuite.setNumberOfBedroom(penthouseSuite.getNumberOfBedroom()+1);
    }

    public void upgrade(Studio studio) {
        upgradeSquareFootage(studio);
    }

    private void upgradeSquareFootage(Apartment apartment) {
        apartment.setSquareFootage(apartment.getSquareFootage()+40);
    }
}
