package kata.promotiontext;

import kata.promotiontext.model.Product;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for PromotionTextDecorator before refactoring. You should not modify this class when
 * completing the kata
 */
public class PromotionTextDecoratorTest {

    @Test
    public void decorate_notPromotedNoFreeShippingNoDiscount() {
        String description = "Pre-owned vase";
        Product product = new Product();
        product.setPromoted(false);
        product.setOldCentPrice(10000);
        product.setCentPrice(10000);
        product.setFreeShipping(false);
        product.setDescription(description);
        product.setPromotionText("Some old text");

        String promotionText = PromotionTextDecorator.decorate(product);

        assertEquals("Returned promotion text should be identical to its description", promotionText, description);
        assertEquals("Product's promotion text should be identical to its description", product.getPromotionText(), description);
    }

    @Test
    public void decorate_notPromotedFreeShippingAndNoHideDiscount() {
        String description = "Pre-owned vase";
        Product product = new Product();
        product.setPromoted(false);
        product.setOldCentPrice(10000);
        product.setCentPrice(9000);
        product.setFreeShipping(true);
        product.setHideDiscount(false);
        product.setDescription(description);
        product.setPromotionText("Some old text");

        String promotionText = PromotionTextDecorator.decorate(product);

        assertEquals("Returned promotion text should be identical to its description", promotionText, description);
        assertEquals("Product's promotion text should be identical to its description", product.getPromotionText(), description);
    }

    @Test
    public void decorate_promotedFreeShippingNoDiscount() {
        String description = "Pre-owned vase";
        Product product = new Product();
        product.setPromoted(true);
        product.setOldCentPrice(10000);
        product.setCentPrice(10000);
        product.setFreeShipping(true);
        product.setDescription(description);
        product.setPromotionText("Some old text");

        String promotionText = PromotionTextDecorator.decorate(product);

        String expected = String.format("Free shipping!\n%s\nFree shipping!", description);
        assertEquals("Returned promotion text should have free shipping header and footer", promotionText, expected);
        assertEquals("Product's promotion text should have free shipping header and footer", product.getPromotionText(), expected);
    }

    @Test
    public void decorate_promotedNoFreeShippingNoHideDiscount() {
        String description = "Pre-owned vase";
        Product product = new Product();
        product.setPromoted(true);
        product.setOldCentPrice(10000);
        product.setCentPrice(9000);
        product.setFreeShipping(false);
        product.setDescription(description);
        product.setHideDiscount(false);
        product.setPromotionText("Some old text");

        String promotionText = PromotionTextDecorator.decorate(product);

        int offInDollar = (product.getOldCentPrice() - product.getCentPrice()) / 100;
        String expected =
                String.format("Don't miss the deal, $%d off!\n%s\nDon't miss the deal, $%d off!",
                        offInDollar, description, offInDollar);
        assertEquals("Returned promotion text should have discount header and footer", promotionText, expected);
        assertEquals("Product's promotion text should have discount header and footer", product.getPromotionText(), expected);
    }

    @Test
    public void decorate_promotedFreeShippingNoHideDiscount() {
        String description = "Pre-owned vase";
        Product product = new Product();
        product.setPromoted(true);
        product.setOldCentPrice(10000);
        product.setCentPrice(9000);
        product.setFreeShipping(true);
        product.setDescription(description);
        product.setHideDiscount(false);
        product.setPromotionText("Some old text");

        String promotionText = PromotionTextDecorator.decorate(product);

        int offInDollar = (product.getOldCentPrice() - product.getCentPrice()) / 100;
        String offText = String.format("Don't miss the deal, $%d off!", offInDollar);
        String freeShippingText = "Free shipping!";
        String expected =
                String.join("\n", offText, freeShippingText, description, freeShippingText, offText);
        assertEquals("Returned promotion text should have both discount and free shipping headers and footers", promotionText, expected);
        assertEquals("Product's promotion text should have both discount and free shipping headers and footers", product.getPromotionText(), expected);
    }

    @Test
    public void decorate_promotedNoFreeShippingHideDiscount() {
        String description = "Pre-owned vase";
        Product product = new Product();
        product.setPromoted(true);
        product.setOldCentPrice(10000);
        product.setCentPrice(9000);
        product.setFreeShipping(false);
        product.setDescription(description);
        product.setHideDiscount(true);
        product.setPromotionText("Some old text");

        String promotionText = PromotionTextDecorator.decorate(product);

        assertEquals("Returned promotion text should be identical to its description", promotionText, description);
        assertEquals("Product's promotion text should be identical to its description", product.getPromotionText(), description);
    }

    @Test
    public void decorate_promotedNoFreeShippingNoDiscount() {
        String description = "Pre-owned vase";
        Product product = new Product();
        product.setPromoted(true);
        product.setOldCentPrice(10000);
        product.setCentPrice(10000);
        product.setFreeShipping(false);
        product.setDescription(description);
        product.setPromotionText("Some old text");

        String promotionText = PromotionTextDecorator.decorate(product);

        assertEquals("Returned promotion text should be identical to its description", promotionText, description);
        assertEquals("Product's promotion text should be identical to its description", product.getPromotionText(), description);
    }
}
