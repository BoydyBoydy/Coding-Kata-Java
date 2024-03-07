package kata.promotiontext;

import kata.promotiontext.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * PromotionTextDecorator generates promotion text for a product.
 */
public class PromotionTextDecorator {
    /**
     * Generate and set promotion text for a product.
     *
     * @param product the product
     * @return the generated promotion text
     */

    private final Product product;
    private final List<String> stringList;

    public static String decorate(Product product) {
        return new PromotionTextDecorator(product).decorate();
    }

    public String decorate() {
        if (product.isPromoted()) {
            addPromotionText();
        } else {
            addDescription();
        }
        setPromotionText();
        return product.getPromotionText();
    }

    private void setPromotionText() {
        setPromotionText(product, stringList);
    }

    private void addDescription() {
        addDescription(product, stringList);
    }

    private void addPromotionText() {
        applyDiscount(product, stringList);
        addFreeShipping(product, stringList);
        addDescription();
        addFreeShipping(product, stringList);
        applyDiscount(product, stringList);
    }

    private static void setPromotionText(Product product, List<String> list) {
        product.setPromotionText(String.join("\n", list));
    }

    private static void addDescription(Product product, List<String> list) {
        list.add(product.getDescription());
    }

    private static void applyDiscount(Product product, List<String> list) {
        if (!product.isHideDiscount() && (product.getCentPrice() < product.getOldCentPrice())) {
            list.add(String.format("Don't miss the deal, $%d off!",
                    (product.getOldCentPrice() - product.getCentPrice()) / 100));
        }
    }

    private static void addFreeShipping(Product product, List<String> list) {
        if (product.isFreeShipping()) {
            list.add("Free shipping!");
        }
    }

    protected PromotionTextDecorator(Product product) {
        this.product = product;
        stringList = new ArrayList<>();
    }
}
