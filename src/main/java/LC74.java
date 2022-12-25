public class LC74 {

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][] {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 3));
        System.out.println(searchMatrix(new int[][] {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}}, 13));

    }

    //Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
    //
    //Integers in each row are sorted from left to right.
    //The first integer of each row is greater than the last integer of the previous row.
    //
    //
    //Example 1:
    //
    //
    //Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
    //Output: true
    //Example 2:
    //
    //
    //Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
    //Output: false
    //
    //
    //Constraints:
    //
    //m == matrix.length
    //n == matrix[i].length
    //1 <= m, n <= 100
    //-104 <= matrix[i][j], target <= 104

    public static boolean searchMatrix(int[][] matrix, int target){
        int left = 0;
        int right = matrix[0].length;

        int efficient = matrix[0].length-1;
        int count = 0;

        while(count< matrix.length-1){
            if(matrix[count][efficient] < target){
                count++;
            }else if(matrix[count][efficient] == target){
                return true;
            }else if(matrix[count][efficient] > target){
                break;
            }
        }

        while(left< right){
            int mid = Math.floorDiv(left+right,2);
            int midValue = matrix[count][mid];

            if(midValue> target){
                right = mid;
            }else if(midValue< target){
                left = mid + 1;
            }else if(midValue == target){
                return true;
            }
        }

        return false;
    }
}
