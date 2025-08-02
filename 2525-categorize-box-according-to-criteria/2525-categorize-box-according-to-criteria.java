class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean Heavy = false;
        boolean Bulky = false;
        double volume = (double)length * width * height;
        if (mass >= 100){
            Heavy = true;
        }
        if (length >= 10000 || width >= 10000 || height >= 10000 ||volume >= 1000000000){
            Bulky = true;
        }
        if (Bulky && Heavy){
            return "Both";
        }
        else if (!Bulky && !Heavy){
            return "Neither";
        }
        else if (Bulky && !Heavy){
            return "Bulky";
        }
        else
            return "Heavy";
    }
}