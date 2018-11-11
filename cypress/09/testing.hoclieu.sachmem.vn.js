describe("Test hoclieu.sachmem.vn", function() {
  beforeEach(function() {
    cy.visit('https://hoclieu.sachmem.vn/');
  })

  it("have dropdown", function() {
    cy.get('.dropdown-toggle')
      .should('be.visible');
  })

  it("have dropdown for change language to english", function() {
    cy.get('.dropdown-item')
      .contains("English");
  })

  it("have login", function() {
    cy.get('.nav-link')
      .should('be.visible');
  })

  it("have icon home", function() {
    cy.get('.fa-home')
      .should('be.visible');
  })

  it("have a list group", function() {
    cy.get('ul.list-group li')
      .should('have.length', 11)
      .should('be.visible');
  })

  it("have lop12", function() {
    cy.get('.text-dark')
      .contains("Lớp 12");
  })

  it("Click lop3 have 3 child", function() {
    cy.get('.text-dark').contains("Lớp 3").click()
      .get('ul.list-group li')
      .should('have.length', 3);
  })
})