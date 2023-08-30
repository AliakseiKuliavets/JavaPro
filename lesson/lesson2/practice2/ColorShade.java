package lesson.lesson2.practice2;

public enum ColorShade {
    BLUE{
        @Override
        String getColorCode() {
            return "#3944BC";
        }
    },
    COBALT{
        @Override
        String getColorCode() {
            return "#1338BE";
        }
    },
    AZURE{
        @Override
        String getColorCode() {
            return "#1520A6";
        }
    };
    abstract String getColorCode();

    ColorShade() {
        System.out.println(this.getClass());
    }
}
