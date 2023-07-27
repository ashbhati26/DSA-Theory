lcaNode = lca(root, n1, n2);

        if (lcaNode != null) {
            System.out.println("Lowest Common Ancestor of " + n1 + " and " + n2 + " is: " + lcaNode.data);
        } else {
            System.out.println("One or both of the nodes not found in the tree.");
        }