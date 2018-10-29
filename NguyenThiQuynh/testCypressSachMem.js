describe('Test hoclieu.sachmem.vn', function() {
	beforeEach(function() {
		cy.visit('https://hoclieu.sachmem.vn/folder/0')
	})

	it('Test login', function() {
		cy.get('a#link-login').contains('Đăng nhập')
	})

	it('Test house icon', function() {
		cy.get('i.fa').should('be.visible')
	})

})

describe('Test gioithieu.sachmem.vn', function() {
	beforeEach(function() {
		cy.visit('https://gioithieu.sachmem.vn/')
	})

	it('Test unorder list', function() {
		cy.get('ul#primary-menu').contains('Giới thiệu')
	})
})

describe('Test do exams', function() {
	beforeEach(function() {
		cy.visit('https://hoclieu.sachmem.vn/question_set/5a4b189348150cd8b906539b/5aaf6fd70080c50210e87415/preview')
	})

	it('Test do all exams', function() {
		cy.get('a.btn-outline-primary').click()
		cy.get('button.btn-warning').click()
	})
})