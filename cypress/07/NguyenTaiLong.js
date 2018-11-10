describe('My First Test', function() {
  it('Visits website and check few contents', function() {
    cy.visit('https://gioithieu.sachmem.vn/')
    cy.contains('lienhe@sachmem.vn')
    cy.contains('Đăng nhập')
    cy.contains('ĐĂNG KÝ') 
  })
})

describe("My Second Test", function() {
	it("Click to visit one chapter", function() {
		cy.visit('https://gioithieu.sachmem.vn/')
	    cy.contains('Hướng dẫn').click() 
		cy.url().should('include', '/huong-dan-su-dung/')
	})
})

describe("My Third Test", function() {
	it("Test search engine by clicking", function() {
		cy.visit('https://gioithieu.sachmem.vn/huong-dan-su-dung/')
		cy.contains('Tìm kiếm')
		cy.get('#epkb_search_terms').type("học máy").should("have.value", 'học máy')
		cy.get('#epkb-search-kb').click()
		cy.contains('Kết quả tìm kiếm học máy')
	})
})

describe("My Fourth Test", function() {
	it("Test search engine by pressing keyboard", function() {
		cy.visit('https://gioithieu.sachmem.vn/huong-dan-su-dung/')
		cy.contains('Tìm kiếm')
		cy.get('#epkb_search_terms').type("học máy").type('{enter}')
		cy.contains('Kết quả tìm kiếm học máy')
	})
})