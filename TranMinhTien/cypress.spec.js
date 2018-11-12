describe("Test login hoclieu.sachmem.vn", () => {
  beforeEach(() => {
    cy.fixture("users/admin").as("admin");
  });
  it("co the dang nhap : admin", function() {
    cy.visit("/login");
    
    cy
      .get('input[name="email"]')
      .type(this.admin.email)
      .should("have.value", this.admin.email);
    cy
      .get('input[name="password"]')
      .type(this.admin.password)
      .should("have.value", this.admin.password);
    cy.get("form").submit();
    cy.location("pathname").should("eq", "/home");
  });
});