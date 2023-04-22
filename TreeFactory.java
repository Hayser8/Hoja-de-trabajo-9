public class TreeFactory {

    public static <K extends Comparable<K>, V> Tree<K, V> createTree(String treeType) {
        if (treeType == null) {
            throw new IllegalArgumentException("Tree type must not be null");
        }

        switch (treeType) {
            case "1":
                return new arbolAVL<>();
            case "2":
                return new arbolRojoNegro<>();
            default:
                throw new IllegalArgumentException("Invalid tree type");
        }
    }
}
