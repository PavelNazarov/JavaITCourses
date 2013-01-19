package proc.loop.array_merger_fixed;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 14.01.13
 * Time: 23:25
 * To change this template use File | Settings | File Templates.
 */
public class Merger {
    public static int[] merge(int[] a, int[] b) { // wrong!
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;

        while (aIndex + bIndex != result.length ) {
            boolean aIndexInBounds = aIndex < a.length;
            boolean bIndexInBounds = bIndex < b.length;

            if(!aIndexInBounds && bIndexInBounds){
                System.arraycopy(b, bIndex, result, aIndex + bIndex, b.length - bIndex);
                break;
            }

            if(!bIndexInBounds && aIndexInBounds){
                System.arraycopy(a, aIndex, result, bIndex + aIndex, a.length - aIndex);
                break;
            }

            if (a[aIndex] < b[bIndex]) {
                result[aIndex + bIndex] = a[aIndex++];
            } else if (bIndexInBounds) {
                result[aIndex + bIndex] = b[bIndex++];
            }
        }

        return result;
    }
}
