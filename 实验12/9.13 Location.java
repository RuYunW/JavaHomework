package sndu.wry;

public class Location {
    public int row=0,column=0;
    public double maxValue;

    public static Location locateLargest(double[][] a){
        Location location = new Location();
        location.maxValue = a[0][0];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                if(location.maxValue<=a[i][j]){
                    location.maxValue = a[i][j];
                    location.row = i;
                    location.column = j;
                }
            }
        }
        return location;
    }
}
