describe("Test hoc lieu page", function() {
  beforeEach(function() {
    cy.visit('hoclieu.sachmem.vn');
  })

  it("Should have login button", function() {
    cy.get('a#link-login')
      .should('be.visible');
  })

  it("Should have logo", function() {
    cy.get('img.logo')
      .should('be.visible');
  })

  it("Should have a navigator", function() {
    cy.get('ul.navbar-nav > li.nav-item')
      .should('have.length', 4)
      .should('be.visible');
  })

  it("Should have a list group", function() {
    cy.get('ul.list-group > li.list-group-item')
      .should('have.length', 11)
      .should('be.visible');
  })
})

describe("Test login hoclieu page", function() {
  beforeEach(function() {
    cy.visit("https://accounts.sachmem.vn/users/sign_in");
  })

  it("layout", function() {
    cy.get('.panel')
      .should('be.visible')
      .should('have.length', 3);

    cy.get("h1.title")
      .should("be.visible");

    cy.get('img.logo-form')
      .should('be.visible');

    cy.get('form.new_user')
      .should('be.visible');

    cy.get('form.new_user input#user_email')
      .should('be.visible');

    cy.get('form.new_user input#user_password')
      .should('be.visible');

    cy.get('form.new_user input#user_remember_me')
      .should('be.visible');

    cy.get('form.new_user a.btn-facebook')
      .should('be.visible');

    cy.get('form.new_user a.btn-google')
      .should('be.visible');

  })
})