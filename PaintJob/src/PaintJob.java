public class PaintJob {

    public static void main(String[] args) {
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1;
        double totalArea = width * height;
        double extraBucketsArea = areaPerBucket * extraBuckets;
        double bucketsRequired = Math.ceil((totalArea - extraBucketsArea) / areaPerBucket);

        return (int) bucketsRequired;
    }

    public static int getBucketCount (double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1;
        double totalArea = width * height;
        double bucketsRequired = Math.ceil((totalArea) / areaPerBucket);

        return (int) bucketsRequired;
    }

    public static int getBucketCount (double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) return -1;

        double bucketsRequired = Math.ceil(area / areaPerBucket);
        return (int) bucketsRequired;
    }
}
