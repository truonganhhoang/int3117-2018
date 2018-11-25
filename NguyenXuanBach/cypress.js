describe('My First Test', function() {
  it('Visits the sachmem', function() {
    cy.visit('https://hoclieu.sachmem.vn');
    cy.contains('Giới thiệu')
       .should('be.visible')
  });
  it("Test contain 'Giới thiệu'",function() {
    cy.contains('Giới thiệu')
       .should('be.visible')
  });
  it("Test redirect 'Đăng nhập'",function() {
    cy.contains("Sách mềm").click();
    cy.url().should('include','https://hoclieu.sachmem.vn');
  })
})