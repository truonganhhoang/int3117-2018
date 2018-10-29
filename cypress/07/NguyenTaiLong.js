describe('My First Test', function() {
  it('Visits website and check few contents', function() {
    cy.visit('http://openbookproject.net/thinkcs/python/english3e/index.html')
    cy.contains('index')
    cy.contains('next')
    cy.contains('Chapter') 
  })
})

describe("My Second Test", function() {
	it("Click to visit one chapter", function() {
		cy.visit('http://openbookproject.net/thinkcs/python/english3e/index.html')
		cy.contains('Chapter 1').click()
		cy.url().should('include', '.html')
	})
})

describe("My Third Test", function() {
	it("Test search engine", function() {
		cy.visit('http://openbookproject.net/thinkcs/python/english3e/index.html')
		cy.contains('Search Page').click()
		cy.get('body > div.document > div.documentwrapper > div > form > input[type="text"]:nth-child(1)').type("list").should("have.value", 'list')
		cy.get('body > div.document > div.documentwrapper > div > form > input[type="submit"]:nth-child(2)').click()
		cy.contains('Searching')
	})
})

   // // Should be on a new URL which includes '/commands/actions'
    // cy.url().should('include', '/commands/actions')

    // // Get an input, type into it and verify that the value has been updated
    // cy.get('.action-email')
    //   .type('fake@email.com')
    //   .should('have.value', 'fake@email.com')